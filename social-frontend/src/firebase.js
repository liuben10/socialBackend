import firebase from 'firebase'

var config = {
  apiKey: "AIzaSyAkaChX1bktWOGgHNOg4QkscqmNGQIEe-Q",
  authDomain: "vibe-2bbdb.firebaseapp.com",
  databaseURL: "https://vibe-2bbdb.firebaseio.com",
  projectId: "vibe-2bbdb",
  storageBucket: "vibe-2bbdb.appspot.com",
  messagingSenderId: "702818850594"
};
firebase.initializeApp(config);
export default firebase;
export const provider = new firebase.auth.FacebookAuthProvider();
export const auth = firebase.auth();