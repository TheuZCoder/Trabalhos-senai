import { Component, OnInit } from '@angular/core';
import { Curriculo } from 'src/app/models/curriculo.model';
import { CurriculoService } from 'src/app/service/curriculos.service';
@Component({
  selector: 'app-painel-curriculos',
  templateUrl: './painel-curriculos.component.html',
  styleUrls: ['./painel-curriculos.component.css'],
})
export class PainelCurriculosComponent implements OnInit {
  listarcurriculo(_t45: Curriculo) {
    throw new Error('Method not implemented.');
  }
  public curriculo: Curriculo = new Curriculo(0,'', '', 0, '', '', '');
  // Uma instância de 'Curriculo' para rastrear os dados do formulário
  public curriculos: Curriculo[] = [];
  // Uma matriz para armazenar as Curriculos listadas
  constructor(private _curriculosService: CurriculoService) {}
  // aplica o serviço 'CurriculoService' no construtor
  ngOnInit(): void {
    this.listarCurriculos();
    // Quando o componente é inicializado, lista as Curriculos disponíveis
  }
  listarCurriculos() {
    // Lista as Curriculos do servidor usando o serviço 'CurriculoService'
    this._curriculosService.getCurriculos().subscribe((retornaCurriculo) => {
      this.curriculos = retornaCurriculo.map((item) => {
        // Mapeia os dados retornados para objetos 'Curriculo'
        return new Curriculo(
          item.id,
          item.nome,
          item.sobrenome,
          item.salario,
          item.foto,
          item.escolaridade,
          item.experiencia
        );
      });
    });
  }
  listarCurriculo(curriculo: Curriculo) {
    // Função para listar uma Curriculo individual no formulário para edição
    this.curriculo = curriculo;
    // A Curriculo clicada é definida como a Curriculo atual no formulário
  }
  cadastrar() {
    // Função para cadastrar uma nova Curriculo
    this._curriculosService.cadastrarCurriculo(this.curriculo).subscribe(
      () => {
        // Após cadastrar com sucesso
        this.curriculo = new Curriculo(0,'', '', 0, '', '', ''); // Limpa o formulário
        this.listarCurriculos(); // Atualiza a lista de Curriculos
      },
      (err) => {
        console.log('Erro ao cadastrar', err);
        // Em caso de erro, exibe uma mensagem no console
      }
    );
  }
  atualizar(nome: String) {
    // Função para atualizar uma Curriculo existente
    this._curriculosService.atualizarCurriculo(String, this.curriculo).subscribe(
      () => {
        // Após atualizar com sucesso
        this.curriculo = new Curriculo(0,'', '', 0, '', '', ''); // Limpa o formulário
        this.listarCurriculos(); // Atualiza a lista de Curriculos
      },
      (err) => {
        console.log('Erro ao atualizar', err);
      }
    );
  }
  excluir(nome: String) {
    // Função para excluir uma Curriculo
    this._curriculosService.removerCurriculo(String).subscribe(
      () => {
        // Após excluir com sucesso
        this.curriculo = new Curriculo(0,'', '', 0, '', '', ''); // Limpa o formulário
        this.listarCurriculos(); // Atualiza a lista de Curriculos
      },
      (err) => {
        console.log('Erro ao excluir', err);
      }
    );
  }
}
