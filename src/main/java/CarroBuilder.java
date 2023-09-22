import java.util.Date;

public class CarroBuilder {
    private Carro carro;

    public CarroBuilder(){carro = new Carro();}

    public Carro build(){
        if (carro.getMarca().equals("")) {
            throw new IllegalArgumentException("Marca inválida");
        }
        if (carro.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return carro;
    }

    public CarroBuilder setMarca(String marca) {
        carro.setMarca(marca);
        return this;
    }

    public CarroBuilder setNome(String nome) {
        carro.setNome(nome);
        return this;
    }

    public CarroBuilder setDataFabricacao(Date dataFabricacao) {
        carro.setDataFabricacao(dataFabricacao);
        return this;
    }

    public CarroBuilder setCorCarro(String corCarro) {
        carro.setCorCarro(corCarro);
        return this;
    }

    public CarroBuilder setCilindrada(int cilindrada) {
        carro.setCilidrada(cilindrada);
        return this;
    }

    public CarroBuilder setModelo(String modelo) {
        carro.setModelo(modelo);
        return this;
    }

    public CarroBuilder setPlaca(String placa) {
        carro.setPlaca(placa);
        return this;
    }
    public CarroBuilder setNumeroPortas(int numeroPortas) {
        carro.setNumeroPortas(numeroPortas);
        return this;
    }
    public CarroBuilder setTransmissao(String transmissao) {
        carro.setTransmissao(transmissao);
        return this;
    }

    public CarroBuilder setTipoCombustivel(String tipoCombustivel) {
        carro.setTipoCombustivel(tipoCombustivel);
        return this;
    }
}
