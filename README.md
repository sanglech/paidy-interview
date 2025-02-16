<img src="/paidy.png?raw=true" width=300 style="background-color:white;">

# Paidy Take-Home Coding Exercises

## What to expect?
We understand that your time is valuable, and in anyone's busy schedule solving these exercises may constitute a fairly substantial chunk of time, so we really appreciate any effort you put in to helping us build a solid team.

## What we are looking for?
**Keep it simple**. Read the requirements and restrictions carefully and focus on solving the problem.

**Treat it like production code**. That is, develop your software in the same way that you would for any code that is intended to be deployed to production. These may be toy exercises, but we really would like to get an idea of how you build code on a day-to-day basis.

## How to submit?
You can do this however you see fit - you can email us a tarball, a pointer to download your code from somewhere or just a link to a source control repository. Make sure your submission includes a small **README**, documenting any assumptions, simplifications and/or choices you made, as well as a short description of how to run the code and/or tests. Finally, to help us review your code, please split your commit history in sensible chunks (at least separate the initial provided code from your personal additions).

## The Interview:
After you submit your code, we will contact you to discuss and potentially arrange an in-person interview with some of the team.
The interview will cover a wide range of technical and social aspects relevant to working at Paidy, but importantly for this exercise: we will also take the opportunity to step through your submitted code with you.

## The Exercises:
### 1. [Platform] Build an API for managing users
The complete specification for this exercise can be found in the [UsersAPI.md](UsersAPI.md).

### 2. [Frontend] Build a SPA that displays currency exchange rates
The complete specification for this exercise can be found in the [Forex-UI.md](Forex-UI.md).

### 3. [Platform] Build a local proxy for currency exchange rates
The complete specification for this exercise can be found in the [Forex.md](Forex.md).

### 5. [Platform] Build an API for managing a restaurant
The complete specification for this exercise can be found at [SimpleRestaurantApi.md](SimpleRestaurantApi.md)

## F.A.Q.
1) _Is it OK to share your solutions publicly?_
Yes, the questions are not prescriptive, the process and discussion around the code is the valuable part. You do the work, you own the code. Given we are asking you to give up your time, it is entirely reasonable for you to keep and use your solution as you see fit.

2) _Should I do X?_
For any value of X, it is up to you, we intentionally leave the problem a little open-ended and will leave it up to you to provide us with what you see as important. Just remember to keep it simple. If it's a feature that is going to take you a couple of days, it's not essential.

3) _Something is ambiguous, and I don't know what to do?_
The first thing is: don't get stuck. We really don't want to trip you up intentionally, we are just attempting to see how you approach problems. That said, there are intentional ambiguities in the specifications, mainly to see how you fill in those gaps, and how you make design choices.
If you really feel stuck, our first preference is for you to make a decision and document it with your submission - in this case there is really no wrong answer. If you feel it is not possible to do this, just send us an email and we will try to clarify or correct the question for you.

Good luck!

# Christian's Solution To implement for ForEx

To get around the limitation with the one frame API, need to create a cache using Map that maps the currecny conversion to be done to the value and timestamp.
Thus before hitting the one frame API, check the cache first to limit the number of get requests with the singular token. 
Also, calculate the inverse and store in cache. (i.e. if user asks for USDJPY, the JPYUSD is the inverse of USDJPY and we can store that value in cahce on the same API call)

Things to also check: 
- User enters invalid currencies (Dont hit api send error: Invalid currencies)
- User enters invalid input. (Error: Invalid Input)
- User enters currency we do not support (Error: Unsppoorted currency)