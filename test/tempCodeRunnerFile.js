// var a = [1, 2, 3];
// a.a = '4sdv4'
// for (var x of a) {
//   console.log(x)
// }
// console.log(a.a)

// var a = [1, 2, 3];
// a.sb = 'you';
// for (var x in a) {
//   console.log(x)
// }

//array的forEach
// var a = ['A', 'B', 'C'];
// a.forEach(function (element, index, array) {
//   console.log(index + ':' + element);
// });
//map的forEach
// var b =new Map([[1,'A'],[2,'B'],[3,'C']])
// b.forEach(function(value,key,map){
//   console.log(value)
// });

//set的forEach
// var set =new Map([[1,"a"],[2,"b"],[3,"4"]]);
// set.forEach(function (element,index,array){//element是value,index是key相当于序号
//     // element: 指向当前元素的值
//     // index: 指向当前索引
//     // array: 指向Array对象本身
//   console.log(index+':'+element+"----->"+array);
// } );

function abs(x){
  if(x>=0){
    return x;
  }else{
    return -x;
  }
}
console.log(abs(- 5));