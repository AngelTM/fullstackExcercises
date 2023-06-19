import { useState } from "react"
import {FaStar}from "react-icons/fa"


const createArray = (length)=>[
    ...Array(length)
]

function Star({selected=false,onSelect}) {
    return <FaStar color={selected ? "blue":"gray"} onClick={onSelect} ></FaStar>
}


export function Stars({totalStars=4}) {

    const [selectedStars,setSelectedStars] = useState(0)

    return createArray(totalStars).map((n,i)=>(
        <Star key={i} selected={selectedStars>i} onSelect={()=>setSelectedStars(i+1)}></Star>
    ))
}