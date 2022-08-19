package com.mycompany.pessoa;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private PessoaInfo leitor;

    public Livro(String titulo, String autor, int totPaginas, PessoaInfo leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    
    
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (p>totPaginas) {
        this.pagAtual = totPaginas;
        } else {
        this.pagAtual = p;
        }
    } 
        
    @Override
    public void avancarPag() {
        if (this.getAberto()&&this.pagAtual<this.totPaginas){
            this.pagAtual++;
        } else {
            System.out.println("Abra o livro para avançar a página.");
        }
    }

    @Override
    public void voltarPag() {
        if (this.getAberto()&&this.pagAtual>0){
            this.pagAtual--;
        } else if(this.getAberto()==false) {
            System.out.println("Abra o Livro para voltar a página.");
        }
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String t){
        titulo = t;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String a){
        autor = a;
    }
    public int getTotPaginas(){
        return totPaginas;
    }
    public void setTotPaginas(int tot){
        totPaginas = tot;
    }
    public int getPagAtual(){
        return pagAtual;
    }
    public void setPagAtual(int p){
        pagAtual = p;
    }
    public boolean getAberto(){
        return aberto;
    }
    public void setAberto(boolean a){
        aberto = a;
    }
    public PessoaInfo getLeitor(){
        return leitor;
    }
    public void setLeitor(PessoaInfo l){
        leitor = l;
    }
    public void detalhes(){
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Paginas: "+  this.getTotPaginas());
        System.out.println("Pagina atual: " + this.getPagAtual());
        System.out.println("Aberto: " + this.getAberto());
        System.out.println("Leitor: "+ leitor.getNome());
        System.out.println("");
    }
}