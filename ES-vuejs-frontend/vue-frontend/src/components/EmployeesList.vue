<template>
  <div class = "container">

    <h1 class = "text-center"> Employees List</h1>

    <table class = "table table-striped">
      <thead>
      <tr>
        <th> Employee Id</th>
        <th> Employee First Name</th>
        <th> Employee Last Name</th>
        <th> Employee Email</th>
      </tr>

      </thead>
      <tbody>
      <tr v-for="employee in employees" v-bind:key="employee.id">
        <td> {{employee.id }}</td>
        <td> {{employee.firstName }}</td>
        <td> {{employee.lastName}}</td>
        <td> {{employee.email}}</td>
      </tr>
      </tbody>
    </table>
  </div>
</template>

<script>

import EmployeeService from '../services/EmployeeService';

export default {
  name: 'EmployeeS',
  data(){
    return {
      employees: [
        {
          "id": 1,
          "firstName": "Josh",
          "lastName": "Underwood",
          "email": "ramesh@gmail.com"
        },
        {
          "id": 2,
          "firstName": "Peter",
          "lastName": "Parker",
          "email": "tony@gmail.com"
        },
        {
          "id": 3,
          "firstName": "Chris",
          "lastName": "Evans",
          "email": "cena@gmail.com"
        }
      ]
    }
  },
  methods: {
    getEmployees(){
      EmployeeService.getEmployees().then((response) => {
        this.employees = response.data;
      });
    }
  },
  created() {
    this.getEmployees();
  }
}

</script>
