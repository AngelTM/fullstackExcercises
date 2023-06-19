import React,{Component} from "react";
import { ItemCardComponent } from "./ItemCardComponent";

class ItemsComponent extends Component{
    constructor(props){
        super(props);
        this.state ={
            Items:[]
        };
    }

    async getItems(){
        try {
            const url = "https://mhw-db.com/monsters";
            const ItemsResponse = await fetch(url);
            const ItemsJson = await ItemsResponse.json();
            //console.log(ItemsJson.results)
            this.setState({
                Items: ItemsJson
            })
            console.log(this.state.Items);
        } catch (error) {
            
        }
        
    }

    componentDidMount(){
        this.getItems();
    }

    renderItems(){
        return this.state.Items.map((item)=>(
             <ItemCardComponent key={item.id} item={item}/>
        ));
    }

    render(){
        return(
            <div className="row">
                {this.renderItems()}
            </div>
        )
    }
}

export default ItemsComponent;