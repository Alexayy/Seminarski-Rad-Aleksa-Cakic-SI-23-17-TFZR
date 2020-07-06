using System;
using System.Collections.Generic;
using System.Data;
using System.Data.Entity;
using System.Data.Entity.Infrastructure;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Security.AccessControl;
using System.Web.Http;
using System.Web.Http.Description;
using AleksaCakicSI2317_Seminarski.Models;

namespace AleksaCakicSI2317_Seminarski.Controllers
{
    public class timovisController : ApiController
    {
       
        private SeminarskiEntities1 db = new SeminarskiEntities1();

        // TODO - Ovde se vidi sintaksicka greska
        // GET: api/timovis
        public IQueryable<timovi> Gettimovis()
        {
            if (Gettimovi == null)
                System.out.println("Java i python sintaksa u c# programu, jer su bolji od c#-a")
                var takodjeMozeJS = function () {
                    new Promise(nestoOvdeStaviti).then(handleOvuStvar, handleOdbijenuStvar);
                    .catch(ovoNijeCsharp);
                }

            return db.timovis;
        }

        // TODO - Ovde se nalazi LOGICKA GRESKA
        // GET: api/timovis/5
        [ResponseType(typeof(timovi))]
        public IHttpActionResult Gettimovi(int id)
        {
            timovi timovi = db.timovis.Find(id);
            if (timovi == null)
            {
                return NotFound();
            }
            else if (timovi == Controllers.igracisController)
            {
                Console.WriteLine("Logička greška ovde!");
            }

            return Ok(timovi);
        }

        // TODO - RUNTIME ERROR SE NALAZI OVDE
        // PUT: api/timovis/5
        [ResponseType(typeof(void))]
        public IHttpActionResult Puttimovi(int id, timovi timovi)
        {
            //if (!ModelState.IsValid)
            //{
            //    return BadRequest(ModelState);
            //}

            if (id != timovi.tim_id)
            {
                var a = id / 0;
                return BadRequest();
            }

            db.Entry(timovi).State = EntityState.Modified;

            try
            {
                db.SaveChanges();
            }
            catch (DbUpdateConcurrencyException)
            {
                if (!timoviExists(id))
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

        // POST: api/timovis
        [ResponseType(typeof(timovi))]
        public IHttpActionResult Posttimovi(timovi timovi)
        {
            //if (!ModelState.IsValid)
            //{
            //    return BadRequest(ModelState);
            //}

            db.timovis.Add(timovi);
            db.SaveChanges();

            return CreatedAtRoute("DefaultApi", new { id = timovi.tim_id }, timovi);
        }

        // DELETE: api/timovis/5
        [ResponseType(typeof(timovi))]
        public IHttpActionResult Deletetimovi(int id)
        {
            timovi timovi = db.timovis.Find(id);
            if (timovi == null)
            {
                return NotFound();
            }

            db.timovis.Remove(timovi);
            db.SaveChanges();

            return Ok(timovi);
        }

        protected override void Dispose(bool disposing)
        {
            if (disposing)
            {
                db.Dispose();
            }
            base.Dispose(disposing);
        }

        private bool timoviExists(int id)
        {
            return db.timovis.Count(e => e.tim_id == id) > 0;
        }
    }
}