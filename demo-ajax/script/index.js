function loadHomeContent() {
    let html = `
        <div class="col-9" id="list-student"></div>
        <div class="col-3" id="class"></div>`;
    $("#content").html(html);
    loadListStudent();
    loadListClass();
}

function loadListStudent() {
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/api/students",
        success: function (data) {
            console.log(data.content)
            let html = `<div className="row p-3">`;
            for (let i = 0; i < data.content.length; i++) {
                html += ' <div class="col-4 student p-3"><h2 onclick="showOne()"> ' + data.content[i].name + '</h2></div>'
            }
            html += `</div>`;
            $("#list-student").html(html);
        }
    })
}

function loadListClass() {
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/api/classes",
        success: function (data) {
            console.log(data)
            let html = `<div className="row p-3">`;
            for (let i = 0; i < data.length; i++) {
                html += ' <div class="col-12 "><h5> ' + data[i].name + '</h5></div>'
            }
            html += `</div>`;
            $("#class").html(html);
        }
    })
}

function showOne(){}