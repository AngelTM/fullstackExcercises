import React from "react";

export const ItemCardComponent = ({item})=>{
    return(
        <div className="col s4">
            <div className="card">
                <div className="card-image">
                    <img src="https://static.wikia.nocookie.net/monsterhunter/images/1/1c/MHWI-Fatalis_Render_001.png"></img>
                </div>
                <p>{item.name}</p>
                <p>{item.description}</p>
            </div>
        </div>
    )
}