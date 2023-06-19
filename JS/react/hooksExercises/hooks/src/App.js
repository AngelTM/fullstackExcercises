import logo from './logo.svg';
import './App.css';
import { PackageDeliver } from './components/PackageDeliverComponent';
import { Stars } from './components/StarsComponent';

function NameLabel(props) {
  return( 
  <>
    <h1>Hello my name is {props.name} {props.apellido}</h1>
  </>
  )
}

function App() {
  return (
    <div className="App">
      <NameLabel name="Angel" apellido="Garate" ></NameLabel>
      <PackageDeliver></PackageDeliver>
      <Stars totalStars={5}></Stars>
    </div>
  );
}

export default App;
