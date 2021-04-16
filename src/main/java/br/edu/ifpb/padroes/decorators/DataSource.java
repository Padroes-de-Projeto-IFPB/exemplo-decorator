package br.edu.ifpb.padroes.decorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}
