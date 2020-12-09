import React from "react";

const Home = () => {
  const user = JSON.parse(localStorage.getItem("user"));
  console.log("user: " + user);
  return <div>Welcome User {user.username}</div>;
};

export default Home;
