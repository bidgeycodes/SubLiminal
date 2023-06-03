<template>
    <div>
      <label for="order-selector">Order entries:</label>
      <select id="order-selector" v-model="orderSelector">
        <option value="descending">Descending</option>
        <option value="ascending">Ascending</option>
        <option value="byLocation">By Location</option>
      </select>
    </div>
  </template>
  
  <script>
  export default {
    data() {
      return {
        orderSelector: "descending",
      };
    },
  };
  </script>