// interface ICourse {
//     title: string;
//     studentCount: number;
//     price: number
// }

type ICourse = {
    title: string;
    studentCount: number;
    price: number
}

const course: ICourse = {title: "Java full stack", studentCount: 2 , price: 45454}

const courses: ICourse[] = [
    {title: "Java full stack", studentCount: 2 , price: 45454},
    {title: "JavaScript", studentCount: 2 , price: 454}
]

console.log(course);

console.log(courses);

