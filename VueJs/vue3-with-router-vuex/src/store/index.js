import { createStore } from 'vuex'

export default createStore({
  state: {
    name: "Thar Kyaw",
    students: [
      {name: "Su Su", age: 20 , gender: "female"},
      {name: "Ko KO", age: 21 , gender: "male"},
      {name: "Mg Mg", age: 21 , gender: "male"},
      {name: "Mya Mya", age: 25 , gender: "female"},
    ]
  },
  getters: {
    boys(state){
      return state.students.filter(student => student.gender=="male")
    }
  },
  mutations: {
    change(state){
      state.name = "Myat Khaing Kyaw"
    }
  },
  actions: {
    change(store){
      store.commit("change")
    }
  },
  modules: {
  }
})
