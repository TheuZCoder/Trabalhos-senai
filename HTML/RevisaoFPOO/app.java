package RevisaoFPOO;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import RevisaoFPOO.Cadastro.Animais;
import RevisaoFPOO.Cadastro.Cachorro;
import RevisaoFPOO.Cadastro.Gato;
import RevisaoFPOO.Cadastro.OutrosAnimais;
import RevisaoFPOO.Horario.AgendaConsulta;

class App {

     public static void main(String[] args) {
          // criar o vetor de classes
          Gato gatos[] = new Gato[10];
          Cachorro cachorros[] = new Cachorro[10];
          OutrosAnimais outrosAnimais[] = new OutrosAnimais[10];
          // cadastro dos Animais
          // criar os contadores
          int contGatos = 0, contCachorros = 0, contOutros = 0;
          boolean aberto = true;
          JOptionPane.showMessageDialog(null, "Seja Bem-Vindo ao Consultória \n do Dr. Franksthein ");

          while (aberto) {
               int acao1 = Integer.parseInt(JOptionPane.showInputDialog("1- Cadastro \n2-Agendamento \n3-Sair"));
               if (acao1 == 1) {// Cadastro dos Animais
                    int acao2 = Integer
                              .parseInt(JOptionPane.showInputDialog("1- Gato \n2-Cachorro \n3-Outros Animais"));
                    if (acao2 == 1) {// Gato
                         gatos[contGatos] = new Gato();
                         // preeencher os atributos
                         gatos[contGatos].setNome(JOptionPane.showInputDialog("Informe o nome do PET"));
                         gatos[contGatos]
                                   .setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o peso do PET")));
                    } else if (acao2 == 2) {// Cachorro
                         cachorros[contCachorros] = new Cachorro();
                         // preeencher os atributos
                         cachorros[contCachorros].setNome(JOptionPane.showInputDialog("Informe o nome do PET"));
                         cachorros[contCachorros]
                                   .setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o peso do PET")));

                    } else if (acao2 == 3) {// Outros
                         outrosAnimais[contOutros] = new OutrosAnimais();
                         // preeencher os atributos
                         outrosAnimais[contOutros].setNome(JOptionPane.showInputDialog("Informe o nome do PET"));
                         outrosAnimais[contOutros]
                                   .setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o peso do PET")));

                    }
               } else if (acao1 == 2) {// agendamento

               }
          }
     }
}