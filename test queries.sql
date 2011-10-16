select *
from COMIC

select *
from PAGE
where comic_id = 4
order by page_order

select *
from THUMBNAIL
where comic_id = 4
order by page_order
