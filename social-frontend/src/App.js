import React, { Component } from 'react';
import firebase, { auth, provider } from './firebase.js';


import './App.css';

class App extends Component {

  constructor() {
    super();
    this.state = {
      user: null,
    };
    this.login = this.login.bind(this); // <-- add this line
    this.logout = this.logout.bind(this); // <-- add this line
  }

  handleChange(e) {
    /* ... */
  }

  logout() {
    // we will add the code for this in a moment, but need to add the method now or the bind will throw an error
    auth.signOut().then((result) => {
      this.setState({
        user: null
      })
    })
  }

  login() {
    auth.signInWithPopup(provider)
      .then((result) => {
        const user = result.user;
        this.setState({
          user
        });
      });
  }

  render() {
    return (
      <div className="App">
        Hi
        <div className="wrapper">
          <h1>Login</h1>
          {this.state.user ?
            <button onClick={this.logout}>Log Out</button>
            :
            <button onClick={this.login}>Log In</button>
          }
        </div>
      </div>
    );
  }
}

export default App;
