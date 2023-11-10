import { Component } from '@angular/core';
import { Curriculo } from 'src/app/models/curriculo.model';
import { CurriculoService } from 'src/app/service/curriculos.service';

@Component({
  selector: 'app-curriculos',
  templateUrl: './curriculos.component.html',
  styleUrls: ['./curriculos.component.css'],
})
export class CurriculosComponent {
  public curriculos: Curriculo[] = []; // Uma matriz para armazenar as vagas
  constructor(private _curriculosService: CurriculoService) {}
  // Injeta o serviço de vagas no construtor do componente
  ngOnInit(): void {
    this.listarVagas();
    // Executa a função de listagem de vagas quando é inicializado
  }
  // Função para listar as vagas
  listarVagas() {
    this._curriculosService.getVagas().subscribe((retornaCurriculo) => {
      this.curriculos = retornaCurriculo.map((item) => {
        // Mapeia os dados retornados para o modelo Vaga
        return new Curriculo(
          item.nome,
          item.foto,
          item.escolaridade,
          item.experiencia,
        );
      });
    });
  }
}
