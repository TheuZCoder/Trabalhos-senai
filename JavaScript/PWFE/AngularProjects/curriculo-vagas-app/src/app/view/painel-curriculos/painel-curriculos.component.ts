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
  public curriculo: Curriculo = new Curriculo('','', '', '', '');
  // Uma instância de 'Vaga' para rastrear os dados do formulário
  public curriculos: Curriculo[] = [];
  // Uma matriz para armazenar as vagas listadas
  constructor(private _curriculosService: CurriculoService) {}
  // aplica o serviço 'VagaService' no construtor
  ngOnInit(): void {
    this.listarVagas();
    // Quando o componente é inicializado, lista as vagas disponíveis
  }
  listarVagas() {
    // Lista as vagas do servidor usando o serviço 'VagaService'
    this._curriculosService.getVagas().subscribe((retornaVaga) => {
      this.curriculos = retornaVaga.map((item) => {
        // Mapeia os dados retornados para objetos 'Vaga'
        return new Curriculo(
          item.nome,
          item.sobrenome,
          item.foto,
          item.escolaridade,
          item.experiencia,
        );
      });
    });
  }
  listarVaga(curriculo: Curriculo) {
    // Função para listar uma vaga individual no formulário para edição
    this.curriculo = curriculo;
    // A vaga clicada é definida como a vaga atual no formulário
  }
  cadastrar() {
    // Função para cadastrar uma nova vaga
    this._curriculosService.cadastrarVaga(this.curriculo).subscribe(
      () => {
        // Após cadastrar com sucesso
        this.curriculo = new Curriculo('', '','', '', ''); // Limpa o formulário
        this.listarVagas(); // Atualiza a lista de vagas
      },
      (err) => {
        console.log('Erro ao cadastrar', err);
        // Em caso de erro, exibe uma mensagem no console
      }
    );
  }
  atualizar(nome: String) {
    // Função para atualizar uma vaga existente
    this._curriculosService.atualizarVaga(String, this.curriculo).subscribe(
      () => {
        // Após atualizar com sucesso
        this.curriculo = new Curriculo('','', '', '', ''); // Limpa o formulário
        this.listarVagas(); // Atualiza a lista de vagas
      },
      (err) => {
        console.log('Erro ao atualizar', err);
      }
    );
  }
  excluir(nome: String) {
    // Função para excluir uma vaga
    this._curriculosService.removerVaga(String).subscribe(
      () => {
        // Após excluir com sucesso
        this.curriculo = new Curriculo('','', '', '', ''); // Limpa o formulário
        this.listarVagas(); // Atualiza a lista de vagas
      },
      (err) => {
        console.log('Erro ao excluir', err);
      }
    );
  }
}
