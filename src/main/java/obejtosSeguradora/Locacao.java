package obejtosSeguradora;

import java.time.LocalDate;

/**
 *
 * @author Luiz
 */
public class Locacao {
    
    public Integer id;
    public Integer id_carro;
    public Integer id_seguradora;
    public Integer id_cliente;
    public LocalDate dataLocacao;
    public LocalDate dataDevolucao;
    public LocalDate dataDevolvida;
    public Double valor;
    public Double valorDesconto;
    public Double valorTotal;
    
}
    