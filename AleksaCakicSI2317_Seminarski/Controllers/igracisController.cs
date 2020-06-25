using System;
using System.Collections.Generic;
using System.Data;
using System.Data.Entity;
using System.Data.Entity.Infrastructure;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;
using System.Web.Http.Description;
using AleksaCakicSI2317_Seminarski.Models;
using System.Web.Http.Cors;

namespace AleksaCakicSI2317_Seminarski.Controllers
{
    public class igracisController : ApiController
    {
        private SeminarskiEntities db = new SeminarskiEntities();

        // GET: api/igracis
        public IQueryable<igraci> Getigracis()
        {
            return db.igracis;
        }

        // GET: api/igracis/5
        [ResponseType(typeof(igraci))]
        public IHttpActionResult Getigraci(int id)
        {
            igraci igraci = db.igracis.Find(id);
            if (igraci == null)
            {
                return NotFound();
            }

            return Ok(igraci);
        }

        // PUT: api/igracis/5
        [ResponseType(typeof(void))]
        public IHttpActionResult Putigraci(int id, igraci igraci)
        {
            //if (!ModelState.IsValid)
            //{
            //    return BadRequest(ModelState);
            //}

            if (id != igraci.igrac_id)
            {
                return BadRequest();
            }

            db.Entry(igraci).State = EntityState.Modified;

            try
            {
                db.SaveChanges();
            }
            catch (DbUpdateConcurrencyException)
            {
                if (!igraciExists(id))
                {
                    return NotFound();
                }
                else
                {
                    throw;
                }
            }

            return StatusCode(HttpStatusCode.NoContent);
        }

        // POST: api/igracis
        [ResponseType(typeof(igraci))]
        public IHttpActionResult Postigraci(igraci igraci)
        {
            //if (!ModelState.IsValid)
            //{
            //    return BadRequest(ModelState);
            //}

            db.igracis.Add(igraci);
            db.SaveChanges();

            return CreatedAtRoute("DefaultApi", new { id = igraci.igrac_id }, igraci);
        }

        // DELETE: api/igracis/5
        [ResponseType(typeof(igraci))]
        public IHttpActionResult Deleteigraci(int id)
        {
            igraci igraci = db.igracis.Find(id);
            if (igraci == null)
            {
                return NotFound();
            }

            db.igracis.Remove(igraci);
            db.SaveChanges();

            return Ok(igraci);
        }

        protected override void Dispose(bool disposing)
        {
            if (disposing)
            {
                db.Dispose();
            }
            base.Dispose(disposing);
        }

        private bool igraciExists(int id)
        {
            return db.igracis.Count(e => e.igrac_id == id) > 0;
        }
    }
}