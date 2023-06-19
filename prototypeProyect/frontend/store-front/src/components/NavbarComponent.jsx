import React from 'react'

export const NavbarComponent = () => {
  return (
        <div>
            <header className="d-flex justify-content-center py-3 bg-light">
            <ul className="nav nav-pills">
                <li className="nav-item"><a href="#" className="nav-link active" aria-current="page">Home</a></li>
                <li className="nav-item"><a href="#" className="nav-link">Users</a></li>
                <li className="nav-item"><a href="#" className="nav-link">Products</a></li>
                <li className="nav-item"><a href="#" className="nav-link">About</a></li>
            </ul>
            </header>
        </div>
  )
}
