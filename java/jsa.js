async function apiCall
{
    return new Promise(resolve=>{
        setTimeout(()=>{
        resolve(('b')},50)
        });
    })
}