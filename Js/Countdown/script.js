const dateToCountdown = '11 Oct 2021'
const daysEl = document.getElementById('days')
const hoursEl = document.getElementById('hours')
const minsEl = document.getElementById('mins')
const secondsEl = document.getElementById('seconds')

function countdown(){
    const finalDate = new Date(dateToCountdown);
    const currentDate = new Date();

    const totalSeconds = (finalDate - currentDate) / 1000;  
    const days = Math.floor(totalSeconds / 3600 / 24);
    const hours = Math.floor(totalSeconds / 3600) % 24;
    const minutes = Math.floor(totalSeconds / 60) % 60;
    const seconds = Math.floor(totalSeconds) % 60;
    
    console.log(days,hours,minutes,seconds);
   
    daysEl.innerHTML = days;
    hoursEl.innerHTML = formatTime(hours);
    minsEl.innerHTML = formatTime(minutes);
    secondsEl.innerHTML = formatTime(seconds);
}

countdown();

function formatTime(time){
    return time < 10 ? `0${time}` : time  ;
}

setInterval(countdown,1000);