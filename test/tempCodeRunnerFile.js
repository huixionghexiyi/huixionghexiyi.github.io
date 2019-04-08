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
var c = new Set(['A','B','C'])
c.forEach(function(element,sameElement,set){
  console.log(element)
});