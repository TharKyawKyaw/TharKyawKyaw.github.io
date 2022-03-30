const app = Vue.createApp({
    // template: '<h2>I am the template</h2>',
    data(){
        return{
            name: "Thar Kyaw",
            age: 29,
            icon: "<strong>panda</strong>",
            status: true,
            title: "myparagraph",
            photo: "luke.jpg",
            mark: 80,
            favfruits: ['apple','orange','papaya'],
            count: 0,
            fname: "",
            ffname: "",
            ffage: "",
            ffgender: "",
            friends: [],
            meters: "",
            kilograms: "",
            bmi: "",
            bmiresult: "",
        }
    },
    methods:{
        greet(){
            alert(this.name)
        },

        savefriends(){
            let friend = {name: this.ffname,age: this.ffage, gender: this.gender}
            console.log(friend)

            this.friends.push(friend)
        },

        computeBMI(){
            let m = this.meters
            let kg = this.kilograms
            this.bmi = kg/(m*m)

            console.log(this.bmi)

            
        }
    }
})
// console.log(app)
app.mount('#app')