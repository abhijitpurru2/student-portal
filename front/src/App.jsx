import Login from "./components/login/Login";
import { Routes, Route } from "react-router-dom";

function App() {
  return (
        <Routes>
            <Route path="/" element={<Login/>}/>
        </Routes>
  );
}

export default App;
