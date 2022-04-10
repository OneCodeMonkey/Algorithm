-- Runtime: 312 ms, faster than 90.87% of MySQL online submissions for Actors and Directors Who Cooperated At Least Three Times.
-- Memory Usage: 0B, less than 100.00% of MySQL online submissions for Actors and Directors Who Cooperated At Least Three Times.
# Write your MySQL query statement below
select actor_id, director_id from ActorDirector group by actor_id, director_id having count(timestamp) >= 3;