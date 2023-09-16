package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros
{
    private List<Livro> livrolist;

    public CatalogoLivros()
    {
        this.livrolist = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao)
    {
        livrolist.add(new Livro(titulo, autor, anoPublicacao));
    }
    
    public List<Livro> pesquisarAutor(String autor)
    {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livrolist.isEmpty())
        {
            for(Livro l : livrolist)
            {
                if(l.getAutor().equalsIgnoreCase(autor))
                {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloDeAnos(int anoInicial, int anoFinal)
    {
        List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
        if(!livrolist.isEmpty())
        {
            for(Livro l : livrolist)
            {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal)
                {
                    livrosPorIntervaloDeAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloDeAnos;
    }

    public Livro pesquisarPorTitulo(String titulo)
    {
        Livro livroPorTitulo = null;

        if(!livrolist.isEmpty())
        {
            for(Livro l : livrolist) {
                if (l.getTitulo().equalsIgnoreCase(titulo))
                {
                    livroPorTitulo = l;
                    break;
                }
            }
        }

        return livroPorTitulo;

    }

}
