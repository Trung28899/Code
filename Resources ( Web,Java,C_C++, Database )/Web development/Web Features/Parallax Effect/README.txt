watched video: 
https://www.youtube.com/watch?v=d34GsFz-HkY
This is the css version of it
There is a better js version but havent done


Basically this block of code do the trick: 

.parallax {
  background: url("img/pic1.jpg") no-repeat center;
  background-size: cover;
  /*background-attachment is the trick;*/
  background-attachment: fixed;
  height: 500px;
}
