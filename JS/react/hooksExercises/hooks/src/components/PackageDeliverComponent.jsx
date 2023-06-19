import { useState } from "react"

export function PackageDeliver() {

    const [status,setStatus] = useState(true)

    return(
        <div>
            <h2>The package is {status ? "Delivered" : "Not Delivered"}</h2>
            <button onClick={()=>setStatus(!status)} >Change Status</button>
        </div>

    )
}