import React,{useEffect,useState} from 'react'


export default function UsersComponent(){

  const [users,setUsers] = useState([]);

  const [userName,setUserName] = useState([]);
  const [password,setPassword] = useState([]);
  const [rol,setRol] = useState([]);


  useEffect(()=>{
    getUsers();
  },[])

  const getUsers = async ()=>{
    const usersRequest = await fetch("http://localhost:8080/api/v1/users");
    const usersJson = await usersRequest.json();
    console.log(usersJson);
    setUsers(usersJson);
  }

  const addUser = async ()=>{
    let user ={
      'userName':userName,
      'password':password,
      'rol':rol
    }
    const userRequest = await fetch("http://localhost:8080/api/v1/users",{
      method:'POST',
      body: JSON.stringify(user),
      headers:{
        'Accept':'application/json',
        'Content-Type':'application/json'
      }
    });

    const userJson = await userRequest.json();
    console.log(userJson);
    /*
    const request = await fetch("https://pokeapi.co/api/v2/pokemon/ditto");
    const pokemon = await request.json();
    console.log(pokemon);
    */
  }

  const handleNameChange =(e)=>{
    const {value} = e.target
    console.log(e.target.value)
    setUserName(value)
  }

  const handlePasswordChange =(e)=>{
    const {value} = e.target
    console.log(e.target.value)
    setPassword(value)
  }
  const handleRolChange =(e)=>{
    const {value} = e.target
    console.log(e.target.value)
    setRol(value)
  }


  /*
  componentDidMount(){
    this.getUsers();
  }
*/
  return (
    <div>
      <div>
        <table className="table">
          <thead>
            <tr>
              <th scope="col">ID</th>
              <th scope="col">User name</th>
              <th scope="col">Rol</th>
              <th scope="col"></th>
            </tr>
          </thead>
          <tbody>
            {
              !users ? 'Loading':users.map((user,index)=>{
                return(
                  <tr key ={index} >
                    <th scope="row">{user.id}</th>
                    <td>{user.userName}</td>
                    <td>{user.rol}</td>
                    <td>
                      <button type="submit" className="btn btn-primary">Select</button>
                    </td>
                  </tr>
                )
              })
            }
            
          </tbody>
        </table>
      </div>
      <br/>
      <div className='container col-sm-4'>
        <h2>Insert User </h2>
        <br/>
        <form>
          <div className="form-group" >
            <label >User Name</label>
            <input type="text" className="form-control" value={userName}  name="userName" onChange={handleNameChange} />
          </div>
          <br/>
          <div className="form-group ">
            <label>Password</label>
            <input type="password" className="form-control" value={password} placeholder="Password" name="password" onChange={handlePasswordChange}/>
          </div>
          <br/>
          <div className="form-group ">
            <label>Rol</label>
            <select className="form-control" name="rol" value={rol} onChange={handleRolChange}>
              <option>admin</option>
              <option>user</option>
            </select>
          </div>
          <button type="submit" className="btn btn-primary" onClick={addUser}>Submit</button>
        </form>
      </div>
    </div>
  )
}

