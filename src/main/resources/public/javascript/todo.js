/**
 * Created by sphat001 on 2/6/17.
 */
/**
 * We use this to make sure we're not trying to do stuff with the
 * elements on the page before the page is even loaded.
 *
 * The use of window.onload is slightly controversial these days, so
 * feel free to google around and replace this with a more
 * up-to-date solution if you think that would be interesting.
 */
window.onload = function() {
    console.log("The page is loaded now!");

    var element = document.getElementById('getAll');
    element.addEventListener("click", getAllTodos, true);
}

var getAllTodos = function() {
    var HttpClient = new HttpClient();
    HttpClient.get("/api/todos", function(returned_json){
        document.getElementById('jsonDump').innerHTML = returned_json;
    });
}

function Conglomerate(){        //Kangaroo
    var id=document.getElementById('todoID').value;
    var limit=document.getElementById('limit').value;
    var status=document.getElementById('status').value;
    var contains=document.getElementById('contains').value;
    var owner=document.getElementById('owner').value;
    var category=document.getElementById('category').value;
    var orderBy=document.getElementById('orderBy').value;
    var url = buildURL(id, limit, status, contains, owner, category, orderBy);

    var HttpClient = new HttpClient();

    HttpClient.get(url, function(returned_json){
        document.getElementById('jsonDump').innerHTML = returned_json;
    });
}

function buildURL(id, limit, status, contains, owner, category, orderBy) {
    if (id) {
        return "/api/todos/"  + id;
    }
    var url = "/api/todos?";
    if (limit) url = url + "&limit=" + limit;
    if (status) url = url + "&status=" + status;
    if (contains) url = url + "&contains=" + contains;
    if (owner) url = url + "&owner=" + owner;
    if (category) url = url + "&category=" + category;
    if (orderBy) url = url + "&orderBy=" + orderBy;
    return url;
}


/**
 * Wrapper to make generating http requests easier. Should maybe be moved
 * somewhere else in the future!.
 *
 * Based on: http://stackoverflow.com/a/22076667
 * Now with more comments!
 */
function HttpClient() {
    // We'll take a URL string, and a callback function.
    this.get = function(aUrl, aCallback){
        var anHttpRequest = new XMLHttpRequest();

        // Set a callback to be called when the ready state of our request changes.
        anHttpRequest.onreadystatechange = function(){

            /**
             * Only call our 'aCallback' function if the ready state is 'DONE' and
             * the request status is 200 ('OK')
             *
             * See https://httpstatuses.com/ for HTTP status codes
             * See https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/readyState
             *  for XMLHttpRequest ready state documentation.
             *
             */
            if (anHttpRequest.readyState == 4 && anHttpRequest.status == 200)
                aCallback(anHttpRequest.responseText);
        }

        anHttpRequest.open("GET", aUrl, true);
        anHttpRequest.send(null);
    }
}
