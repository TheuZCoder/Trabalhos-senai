export class Curriculo {
  nome: string = '';
  sobrenome: string = '';
  escolaridade: string = '';
  experiencia: string = '';
  foto: string = '';
  constructor(
    nome: string,
    sobrenome: string,
    foto: string,
    escolaridade: string,
    experiencia: string
  ){
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.foto = foto
    this.escolaridade = escolaridade;
    this.experiencia = experiencia;
  }
}
