export class Curriculo {
  nome: string = '';
  foto: string = '';
  escolaridade: string = '';
  experiencia: string = '';
  constructor(
    nome: string,
    foto: string,
    escolaridade: string,
    experiencia: string
  ){
    this.nome = nome;
    this.foto = foto;
    this.escolaridade = escolaridade;
    this.experiencia = experiencia;
  }
}
