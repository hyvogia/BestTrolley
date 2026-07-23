import './App.css'
import { BrowserRouter, Routes, Route } from "react-router-dom"
import ProductPage from "./pages/ProductPage"

function App() {

  return (
    <BrowserRouter>
      <Routes>
        <Route path="/products" element={<ProductPage />} />
      </Routes>
    </BrowserRouter>
  )
}

export default App
