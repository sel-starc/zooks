// this jS is for the popupindex.htm
const loginPopup = document.querySelector(".login-popup");
const close = document.querySelector(".close");


window.addEventListener("load", function() {

    showPopup();


})

function showPopup() {
    const timeLimit = 1 // seconds;
    let i = 0;
    const timer = setInterval(function() {
        i++;
        if (i == timeLimit) {
            clearInterval(timer);
            loginPopup.classList.add("show");
        }
        console.log(i)
    }, 1000);
}


close.addEventListener("click", function() {
        loginPopup.classList.remove("show");
    })
    // js for skip with human touch trial
const openModalButtons = document.querySelectorAll(".login-popup")
const closeModalButtons = document.querySelectorAll(".close")
const overlay = document.getElementById(".close")

openModalButtons.forEach(button => {
    button.addEventListener('click', () => {
        const modal = document.querySelector(button.dataset.modalTarget)
        openModal(modal)
    })
})

overlay.addEventListener('click', () => {
    const modals = document.querySelectorAll('.modal.active')
    modals.forEach(modal => {
        closeModal(modal)
    })
})

closeModalButtons.forEach(button => {
    button.addEventListener('click', () => {
        const modal = button.closest('.modal')
        closeModal(modal)
    })
})

function openModal(modal) {
    if (modal == null) return
    modal.classList.add('active')
    overlay.classList.add('active')
}

function closeModal(modal) {
    if (modal == null) return
    modal.classList.remove('active')
    overlay.classList.remove('active')
}