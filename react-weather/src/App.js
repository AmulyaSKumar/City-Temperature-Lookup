import { useEffect, useState } from "react";
import axios from "axios";
import "./App.css";

function App() {
  const [minTemp, setMinTemp] = useState(null);
  const [maxTemp, setMaxTemp] = useState(null);
  const [place, setPlace] = useState("");
  const [show, setShow] = useState(true);

  useEffect(() => {
    axios.get(`http://localhost:8080/${place}`).then((response) => {
      setMinTemp(response.data.minTemp);
      setMaxTemp(response.data.maxTemp);
    });
  }, [place]);

  const handleSearch = () => {
    if (place === "") {
      alert("Can't Proceed further untill city is selected.");
      return;
    }
    setShow(false);
  };
  return (
    <div>
      <div className="page">
        {show ? (
          <div>
            <h2>Search City</h2>
            <select value={place} onChange={(e) => setPlace(e.target.value)}>
              <option defaultValued>Select City</option>
              <option value="Mysore">Mysore</option>
              <option value="Bangalore">Bangalore</option>
              <option value="Kollegal">Kollegal</option>
              <option value="Udupi">Udupi</option>
              <option value="Mandya">Mandya</option>
            </select>
            <br />
            <button onClick={handleSearch}>Search</button>
          </div>
        ) : (
          <div>
            <h2>Temperature for {place}</h2>
            <div>
              <p>Minimum Temperature: {minTemp}°C</p>
              <p>Maximum Temperature: {maxTemp}°C</p>
              <div style={{ textAlign: "right" }}>
                <a
                  href={
                    "https://www.google.com/search?q=" + place + " weather+now"
                  }
                >
                  Live Forecasting
                </a>
              </div>
            </div>
          </div>
        )}
      </div>
    </div>
  );
}

export default App;
