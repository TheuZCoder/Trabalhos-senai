import './App.css';
import React from 'react';
import MapaAtual from './Mapa/MapaAtual';
import MapaLongLati from './Mapa/MapaLongLati';
// Define o componente principal da aplicação, chamado 'App'.
function App() {
  //return (<div className="App">
  //   <MapaAtual />
  // </div>
  // );
  return (
    <div className="App">
      <MapaLongLati />
    </div>
  );
}
// Exporta o componente 'App' como o componente principal da aplicação.
export default App;