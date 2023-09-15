package list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListaTarefa
{
    private List<Tarefa> tarefaList;

    public ListaTarefa() 
    {
        this.tarefaList = new ArrayList<>();
    }
    
    public void AdicionarTarefa(String descricao)
    {
        tarefaList.add(new Tarefa(descricao));
    }

    public void RemoverTarefa(String descricao)
    {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }
    public int ObterNumeroTarefa()
    {
        return tarefaList.size();
    }
    public void obterDescricoesTarefas()
    {
        System.out.println(tarefaList);
    }

    public static void main(String[] args)
    {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número de elementos na lista é: " + listaTarefa.ObterNumeroTarefa());

        listaTarefa.AdicionarTarefa("Tarefa 1");
        listaTarefa.AdicionarTarefa("Tarefa 1");
        listaTarefa.AdicionarTarefa("Tarefa 2");
        System.out.println("O número de elementos na lista é: " + listaTarefa.ObterNumeroTarefa());

        listaTarefa.RemoverTarefa("Tarefa 2");
        System.out.println("O número de elementos na lista é: " + listaTarefa.ObterNumeroTarefa());

        listaTarefa.obterDescricoesTarefas();
    }
}

