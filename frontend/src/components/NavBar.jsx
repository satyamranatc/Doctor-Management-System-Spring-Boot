import React from 'react'
import { Link } from 'react-router-dom'

export default function NavBar() {
  return (
    <nav>
        <h2>Doctor Management System</h2>
        <ul>
            <li><Link to="/">Home</Link></li>
            <li><Link to="/doctors">Doctors</Link></li>
            <li><Link to="/patients">Patients</Link></li>
            <li><Link to="/appointments">Appointments</Link></li>
        </ul>

    </nav>
  )
}
