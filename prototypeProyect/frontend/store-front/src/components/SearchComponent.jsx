
import React  from 'react'

class SearchComponent extends React.Component{

  render(){
    return (
      <div className="row">
          <div className="col-sm-3">
              <label placeholder='search'  className="form-label"></label>
              <input type="text" className="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"/>
          </div>
      </div>
    )
  }
}

export default SearchComponent;


