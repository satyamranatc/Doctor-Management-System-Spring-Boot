import React from 'react'

import {BrowserRouter,Routes,Route} from "react-router-dom"

import NavBar from "./components/NavBar.jsx"
import Home from "./pages/Home.jsx"
import Doctor from "./pages/Doctor.jsx"
import Patient from "./pages/Patient.jsx"
import Appointment from "./pages/Appointment.jsx"



export default function App() {
  return (
    <BrowserRouter>
      <NavBar/>

      <Routes>

        <Route path="/" element={<Home/>}/>
        <Route path="/doctors" element={<Doctor/>}/>
        <Route path="/patients" element={<Patient/>}/>
        <Route path="/appointments" element={<Appointment/>}/>

      </Routes>

    </BrowserRouter>
  )
}
