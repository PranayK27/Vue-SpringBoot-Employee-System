<template>
  <div id="app">
    <Employees />
  </div>
</template>

<script>
import Employees from './components/Employees.vue'

export default {
  name: 'App',
  components: {
    Employees
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
