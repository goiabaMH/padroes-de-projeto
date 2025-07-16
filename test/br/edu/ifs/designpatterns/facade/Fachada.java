package br.edu.ifs.designpatterns.facade;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Locale;

public class Fachada {

    private LinkedHashMap<String, String> clientes = new LinkedHashMap<>();
    private LinkedHashMap<String, Produto> produtos = new LinkedHashMap<>();
    private LinkedHashMap<String, List<Produto>> carrinhoPorCliente = new LinkedHashMap<>();
    private LinkedHashMap<String, List<String>> pedidosPorCliente = new LinkedHashMap<>();

    private int contadorClientes = 0;
    private int contadorProdutos = 0;
    private int contadorPedidos = 0;

    public String registrarCliente(String nome) {
        contadorClientes++;
        String idCliente = String.format("Cli%04d", contadorClientes);
        clientes.put(idCliente, nome);
        carrinhoPorCliente.put(idCliente, new ArrayList<>());
        pedidosPorCliente.put(idCliente, new ArrayList<>());
        return idCliente;
    }

    public List<String> listarClientes() {
        List<String> lista = new ArrayList<>();
        for (Map.Entry<String, String> entry : clientes.entrySet()) {
            lista.add(entry.getKey() + ": " + entry.getValue());
        }
        return lista;
    }

    public String registrarProduto(String nome, double preco) {
        contadorProdutos++;
        String idProduto = String.format("Pro%04d", contadorProdutos);
        produtos.put(idProduto, new Produto(idProduto, nome, preco));
        return idProduto;
    }

    public List<String> listarProdutos() {
        List<String> lista = new ArrayList<>();
        for (Produto p : produtos.values()) {
            lista.add(String.format(Locale.US, "%s: %s ... R$ %.2f", p.getId(), p.getNome(), p.getPreco()));
        }
        return lista;
    }

    public void escolherProduto(String idCliente, String idProduto) {
        List<Produto> carrinho = carrinhoPorCliente.get(idCliente);
        if (carrinho != null && produtos.containsKey(idProduto)) {
            carrinho.add(produtos.get(idProduto));
        }
    }

    public double obterTotal(String idCliente) {
        List<Produto> carrinho = carrinhoPorCliente.get(idCliente);
        if (carrinho == null) return 0.0;
        double total = 0;
        for (Produto p : carrinho) {
            total += p.getPreco();
        }
        return total;
    }

    public String fecharCompra(String idCliente) {
        contadorPedidos++;
        String idPedido = String.format("Ped%04d", contadorPedidos);

        List<Produto> carrinho = carrinhoPorCliente.get(idCliente);
        if (carrinho == null) {
            carrinho = new ArrayList<>();
        }

        List<String> pedidosCliente = pedidosPorCliente.get(idCliente);
        StringBuilder sb = new StringBuilder();
        sb.append(idPedido).append(": [");
        for (int i = 0; i < carrinho.size(); i++) {
            Produto p = carrinho.get(i);
            sb.append(String.format(Locale.US, "%s: %s ... R$ %.2f", p.getId(), p.getNome(), p.getPreco()));
            if (i < carrinho.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");

        pedidosCliente.add(sb.toString());
        carrinho.clear();

        return idPedido;
    }

    public List<String> listarPedidos(String idCliente) {
        return pedidosPorCliente.getOrDefault(idCliente, new ArrayList<>());
    }

    private static class Produto {
        private String id;
        private String nome;
        private double preco;

        public Produto(String id, String nome, double preco) {
            this.id = id;
            this.nome = nome;
            this.preco = preco;
        }

        public String getId() {
            return id;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }
    }
}
