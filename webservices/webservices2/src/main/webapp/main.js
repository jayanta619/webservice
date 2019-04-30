var posts;

function mapPosts() {
    var list = '';
    for (var i = 0; i < posts.length; i++) {
        list += "<div class='card mb-3'>" +
        "<div class='card-body'>" +
          "<h5 class='card-title'>" + posts[i].title + "</h5>" +
          "<h6 class='card-subtitle mb-2 text-muted'>Id: " + posts[i].id + "</h6>" +
          "<p class='card-text'>" + posts[i].body + "</p>" +
          "<a href='#!' class='card-link'>edit</a>" +
          "<a href='#!' class='card-link'  onclick='deletePost("+posts[i].id +","+i+")'>delete</a>" +
        "</div>" + 
      "</div>"
    }
    document.getElementById('posts').innerHTML = list;
}

function getPosts() {
    fetch('http://localhost:8080/webservices2/webapi/webservices2/posts/all')
        .then(res => res.json())
        .then(res => {
            posts = res;
            mapPosts();
        })
}
function deletePost(id){
	
    fetch('http://localhost:8080/webservices2/webapi/webservices2/posts/delete/' +id,{
	    method:"delete"
})
	   .then(res => res.json())
        .then(res => {
          if(res.queryStatus){
        	  
        	  posts.splice(index,1);
//        	  console.log(res);
        	  mapPosts();
          }
        })
	
  	
	
	
}

function editPost() {
    fetch('http://localhost:8080/postbook/webapi/postbook/posts/edit', {
        method: '',
        body: JSON.stringify({
            id: 0,
            title: document.getElementById('title').value,
            body: document.getElementById('body').value
        }),
        headers: {
            'Content-Type': 'application/json'
        }
    })
        .then(res => res.json())
        .then(res => {
            posts.unshift(res);
            document.getElementById('title').value = '';
            document.getElementById('body').value = '';
            mapPosts();
        })
}