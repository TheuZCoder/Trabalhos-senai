import { Component } from '@angular/core';
import { Curriculo } from 'src/app/models/curriculo.model';
import { CurriculoService } from 'src/app/service/curriculos.service';

@Component({
  selector: 'app-curriculos',
  templateUrl: './curriculos.component.html',
  styleUrls: ['./curriculos.component.css'],
})
export class CurriculosComponent {
  public curriculos: Curriculo[] = []; // Uma matriz para armazenar as Curriculos
  constructor(private _curriculosService: CurriculoService) {}
  // Injeta o serviço de Curriculos no construtor do componente
  ngOnInit(): void {
    this.listarCurriculos();
    // Executa a função de listagem de Curriculos quando é inicializado
  }
  // Função para listar as Curriculos
  listarCurriculos() {
    this._curriculosService.getCurriculos().subscribe((retornaCurriculo) => {
      this.curriculos = retornaCurriculo.map((item) => {
        // Mapeia os dados retornados para o modelo Curriculo
        return new Curriculo(
          item.id,
          item.nome,
          item.sobrenome,
          item.salario,
          item.foto,
          item.escolaridade,
          item.experiencia,
        );
      });
    });
  }
}
