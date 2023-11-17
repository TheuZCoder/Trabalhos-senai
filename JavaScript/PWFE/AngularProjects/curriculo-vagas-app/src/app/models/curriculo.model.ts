export class Curriculo {
  id: number = 0;
  nome: string = '';
  sobrenome: string = '';
  salario: number = 0;
  escolaridade: string = '';
  experiencia: string = '';
  foto: string = '';
  constructor(
    id: number,
    nome: string,
    sobrenome: string,
    salario: number,
    foto: string,
    escolaridade: string,
    experiencia: string,
  ){
    this.id = id;
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.salario = salario;
    this.foto = foto;
    this.escolaridade = escolaridade;
    this.experiencia = experiencia;
  }
}
