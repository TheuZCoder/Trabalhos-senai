import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Curriculo } from '../models/curriculo.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class CurriculoService {
  private apiUrl = 'http://localhost:3000/curriculos'; // Caminho para o arquivo JSON

  constructor(private http: HttpClient) {}

  // Obtém a lista de Curriculos a partir do arquivo JSON
  getCurriculos(): Observable<Curriculo[]> {
    return this.http.get<Curriculo[]>(this.apiUrl);
  }

  // Cadastra uma nova Curriculo no servidor
  cadastrarCurriculo(Curriculo: Curriculo): Observable<Curriculo[]> {
    return this.http.post<Curriculo[]>(this.apiUrl, Curriculo);
  }

  // Atualiza uma Curriculo existente no servidor
  atualizarCurriculo(id: any, Curriculo: Curriculo): Observable<Curriculo[]> {
    const urlAtualizar = `${this.apiUrl}/${id}`;
    return this.http.put<Curriculo[]>(urlAtualizar, Curriculo);
  }

  // Remove uma Curriculo do servidor
  removerCurriculo(id: any): Observable<Curriculo[]> {
    const urlDeletar = `${this.apiUrl}/${id}`;
    return this.http.delete<Curriculo[]>(urlDeletar);
  }
}
