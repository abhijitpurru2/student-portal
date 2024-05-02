import React from "react";
import { useState } from 'react';

const Login = () => {
      const [usernameError, setUsernameError] = useState('');
      const [passwordError, setPasswordError] = useState('');

      const onSubmit = (e) => {
        e.preventDefault();

        const formData = new FormData(e.target);
        console.log(formData);
        fetch("http://localhost:8080/login", {
          method: "POST",
          headers: {
            Accept: "application/json",
            "Content-Type": "application/json",
          },
          body: JSON.stringify({
            username: formData.get('username'),
            password: formData.get('password'),
          }),
        })
          .then((response) => response.json())
          .then((data) => {
            if(data.fieldErrors) {
              data.fieldErrors.forEach(fieldError => {
                if(fieldError.field === 'username'){
                  setUsernameError(fieldError.message);
                }

                if(fieldError.field === 'password'){
                  setPasswordError(fieldError.message);
                }
              });
            } else {
              alert("Success !!");
            }
          })
          .catch((err) => err);
      }
    const onUsernameFocus = (e) => {
      e.preventDefault();
      setUsernameError('');
    }

    const onPasswordFocus = (e) => {
      e.preventDefault();
      setPasswordError('');
    }

  return (

    <>
      <section>
        <div className="auth">
            <h1>Student Portal Login</h1>
            <form method="POST" autoComplete="off" onSubmit={onSubmit}>
                      <label htmlFor="username">Username</label>
                      <input type="text" name="username" onFocus={onUsernameFocus}/>
                      <label htmlFor="password">Password</label>
                      <input type="password" name="password" onFocus={onPasswordFocus}/>
                      <input type="submit" name="submit" value="Continue" />
            </form>
        </div>
      </section>
    </>
  );
};

export default Login;
